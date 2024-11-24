import java.util.*;

public class FealPhases {

    public static HashMap<Object, Integer> k3 = new HashMap<Object, Integer>();
    public static HashMap<Object, Integer> globalKeys = new HashMap<Object, Integer>();
    public static HashMap<Object, Integer> k2Candidates = new HashMap<Object, Integer>();


    private static long p0 = 0x0000000000000000L;
    private static long p1 = 0x8080000080800000L;
    private static long p2 = 0x1111111111111111L;
    private static long p3 = p2 ^ 0x8080000080800000L;
    private static long p4 = 0x2222222222222222L;
    private static long p5 = p4 ^ 0x8080000080800000L;
    private static long p6 = 0x3333333333333333L;
    private static long p7 = p6 ^ 0x8080000080800000L;

    private static long c0 = 0x0fdcf6447ff4090aL;
    private static long c1 = 0xb6de6c7c6e7eb3b2L;
    private static long c2 = 0x43b94fd4ce4ab516L;
    private static long c3 = 0x2a8f80ddffc45a9cL;
    private static long c4 = 0xeb8beef759019077L;
    private static long c5 = 0x2442789bfe40e596L;
    private static long c6 = 0x5365ae01bcbf74b7L;
    private static long c7 = 0x8d3ae738ba681d0dL;

    private static ArrayList<List<Long>> cipherTexts = new ArrayList<List<Long>>();

    public static void main(String[] args) {


        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c0, (long) c1)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c2, (long) c3)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c4, (long) c5)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c6, (long) c7)));


        System.out.println(c0);
        List<Integer> matchingPairs1 = new ArrayList<>();
        List<Integer> matchingPairs2 = new ArrayList<>();
        List<Integer> matchingPairs3 = new ArrayList<>();
        List<Integer> matchingPairs4 = new ArrayList<>();
        List<Integer> finalList;


        primaryPhase(c0, c1, matchingPairs1);
        primaryPhase(c2, c3, matchingPairs2);
        primaryPhase(c4, c5, matchingPairs3);
        primaryPhase(c6, c7, matchingPairs4);


        finalList = findMatchingValues(matchingPairs1, matchingPairs2, matchingPairs3, matchingPairs4);

        System.out.println(finalList);
        secondaryPhase(c0, c1, finalList);
        secondaryPhase(c2, c3, finalList);
        secondaryPhase(c4, c5, finalList);
        secondaryPhase(c6, c7, finalList);

        k3Cleaning(4, k3);
        System.out.println(globalKeys.size());


    }



     public static void k3Cleaning(int matches, HashMap<Object, Integer> k3)
     {

         k3.entrySet().removeIf(entry -> entry.getValue() != matches);

         for (Map.Entry<Object, Integer> entry : k3.entrySet()) {
             System.out.println("K3 Key Possible Candidates: " + Integer.toHexString((int)entry.getKey()) + ", Value: " + Integer.toHexString((int) entry.getValue()));
         }
     }


    public static int[] splitTo32Bits(long input) {
        // Extract the high 32 bits
        int high = (int) (input >> 32);
        // Extract the low 32 bits
        int low = (int) input;
        return new int[]{high, low};
    }

    static byte rot2(byte x) {
        return (byte)(((x&255)<<2)|((x&255)>>>6));
    }

    static byte g0(byte a,byte b) {
        return rot2((byte)((a+b)&255));
    }

    static byte g1(byte a,byte b) {
        return rot2((byte)((a+b+1)&255));
    }

    static int pack(byte[] b,int startindex) {
        /* pack 4 bytes into a 32-bit Word */
        return ((b[startindex+3]&255) |((b[startindex+2]&255)<<8)|((b[startindex+1]&255)<<16)|((b[startindex]&255)<<24));
    }

    static void unpack(int a,byte[] b,int startindex) {
        /* unpack bytes from a 32-bit word */

        b[startindex]=(byte)(a>>>24);
        b[startindex+1]=(byte)(a>>>16);
        b[startindex+2]=(byte)(a>>>8);
        b[startindex+3]=(byte)a;
    }

    static int f(int input) {
        byte[] x = new byte[4];
        byte[] y = new byte[4];

        unpack(input,x,0);
        y[1]=g1((byte)((x[0]^x[1])&255),(byte)((x[2]^x[3])&255));
        y[0]=g0((byte)(x[0]&255),(byte)(y[1]&255));
        y[2]=g0((byte)(y[1]&255),(byte)((x[2]^x[3])&255));
        y[3]=g1((byte)(y[2]&255),(byte)(x[3]&255));
        return pack(y,0);
    }

    public static int M(int A) {
        // Extract bytes a0, a1, a2, and a3 from the 32-bit integer A
        int a0 = (A >> 24) & 0xFF;  // Extract the highest 8 bits (first byte)
        int a1 = (A >> 16) & 0xFF;  // Extract the next 8 bits
        int a2 = (A >> 8) & 0xFF;   // Extract the third 8 bits
        int a3 = A & 0xFF;          // Extract the lowest 8 bits (fourth byte)

        // Compute M(A) = (z, a0 ^ a1, a2 ^ a3, z)
        int z = 0x00;               // z is the all-zero byte
        int b1 = a0 ^ a1;           // Second byte
        int b2 = a2 ^ a3;           // Third byte

        // Construct the result by combining these bytes into a 32-bit integer
        int result = (z << 24) | (b1 << 16) | (b2 << 8) | z;
        return result;
    }


    public static void secondaryPhase(long p0, long p1, List<Integer> primarySurvivors )
    {
        long y0, y1, l_dash, z_dash, l0, l1, r0, r1;

        int[] p0_splits = splitTo32Bits(p0);
        int[] p1_splits = splitTo32Bits(p1);


        l0 = p0_splits[0];
        r0 = p0_splits[1];
        l1 = p1_splits[0];
        r1 = p1_splits[1];
        y0 = l0 ^ r0;
        y1 = l1 ^ r1;

        l_dash = l0 ^ l1;
        z_dash = l_dash ^ 0x02000000;



        for (Integer survivor : primarySurvivors)
        {
            int a1 = (survivor >> 8) & 0xFF;
            int a0 = (survivor >> 16) & 0xFF;


            for (int c0 = 0x00; c0 <= 0xFF; c0++) {
                for (int c1 = 0x00; c1 <= 0xFF; c1++) {
                    // Compute D
                    int D = (c0 << 24) | ((a0 ^ c0) << 16) | ((a1 ^ c1) << 8) | c1;


                    int temp1, temp2;

                    temp1 = (int) (y0 ^ D);
                    temp2 = (int) (y1 ^ D);;
                    int Z0, Z1;
                    Z0 = globalDictConstructor(temp1);
                    Z1 = globalDictConstructor(temp2);


                    if ((Z0 ^ Z1) == z_dash)
                    {


                        if(k3.containsKey(D))
                        {
                            int temp = k3.get(D)+1;
                            k3.put(D,temp);

                        }
                        else
                        {
                            k3.put(D, 1);
                        }
                    }
                }
            }
        }


    }

    public static int globalDictConstructor(long checkValue)
    {
        if(globalKeys.containsKey(checkValue))
        {
            return globalKeys.get(checkValue);
        }
        else
        {
            int temp;
            temp = f((int) checkValue);
            globalKeys.put(checkValue, temp);
            return globalKeys.get(checkValue);
        }
    }



    public static void middle16Finding(long i0, long i1, long dashComparator, HashMap<Object, Integer> candidates)
    {
        System.out.println("Print debug in middle16Finding");

        for (int a0 = 0x00; a0 <= 0xFF; a0++) {
            for (int a1 = 0x00; a1 <= 0xFF; a1++) {
                // Construct the 32-bit word A = (0x00, a0, a1, 0x00)
                int A = (0) | (a0 << 16) | (a1 << 8);

                // Calculate Q0 and Q1
                int temp1, temp2;
                temp1 = M((int) i0 ^ A);
                temp2 = M((int) i1 ^ A);;
                int Q0, Q1;
                Q0 = globalDictConstructor(temp1);
                Q1 = globalDictConstructor(temp2);

                int xorResult = Q0 ^ Q1;

                int extractedBits = (xorResult >> 8) & 0xFFFF;
                int dashExtractedBits = (int) ((dashComparator >> 8) & 0xFFFF);


                if (extractedBits == dashExtractedBits)
                {
                    //System.out.println("finding k2 middle");
                    int value = (0) | (a0 << 16) | (a1 << 8);
                    //candidates.add(value);
                    //System.out.printf("Matching pair found: (a0 = 0x%02X, a1 = 0x%02X)%n", a0, a1);
                    if (candidates.containsKey(value))
                    {
                        int temp = (candidates.get(value))+1;
                        candidates.put(value, temp);
                    }
                    else
                    {
                        candidates.put(value, 1);
                    }
                }
            }
        }
    }



    public static void primaryPhase(long p0, long p1, List<Integer> matchingPairs)
     {
         long y0, y1, l_dash, z_dash, l0, l1, r0, r1;

         int[] p0_splits = splitTo32Bits(p0);
         int[] p1_splits = splitTo32Bits(p1);


         l0 = p0_splits[0];
         r0 = p0_splits[1];


         l1 = p1_splits[0];
         r1 = p1_splits[1];

         y0 = l0 ^ r0;
         y1 = l1 ^ r1;

         l_dash = l0 ^ l1;


         z_dash = l_dash ^ 0x02000000;


         for (int a0 = 0x00; a0 <= 0xFF; a0++) {
             for (int a1 = 0x00; a1 <= 0xFF; a1++) {
                 int A = (0) | (a0 << 16) | (a1 << 8);

                 int temp1, temp2;
                 temp1 = M((int) y0 ^ A);
                 temp2 = M((int) y1 ^ A);;
                 int Q0, Q1;
                 Q0 = globalDictConstructor(temp1);
                 Q1 = globalDictConstructor(temp2);

                 int xorResult = Q0 ^ Q1;

                 int extractedBits = (xorResult >> 8) & 0xFFFF;
                 int Z_dash_bits = (int) ((z_dash >> 8) & 0xFFFF);

                 if (extractedBits == Z_dash_bits) {
                     int value = (0) | (a0 << 16) | (a1 << 8);
                     matchingPairs.add(value);
                 }
             }
         }

     }



    public static List<Integer> findMatchingValues(List<Integer> list1, List<Integer> list2,
                                                   List<Integer> list3, List<Integer> list4)
    {
        List<Integer> matchingValues = new ArrayList<>();

        for (Integer value : list1) {
            if (list2.contains(value) && list3.contains(value) && list4.contains(value)) {
                matchingValues.add(value);
            }
        }

        return matchingValues;
    }
}
