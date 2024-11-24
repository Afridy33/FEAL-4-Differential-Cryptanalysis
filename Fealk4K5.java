import java.util.*;



public class Fealk4K5 {
    static int rounds = 4;

    public static HashMap<Object, Integer> k4 = new HashMap<Object, Integer>();
    public static HashMap<Object, Integer> k5 = new HashMap<Object, Integer>();

    public static HashMap<Object, Integer> globalKeys = new HashMap<Object, Integer>();
    //public static HashMap<Object, Integer> k2Candidates = new HashMap<Object, Integer>();



    public static long p0 = 0x1A2B3C4D5E6F7081L;
    public static long p1 = 0x9F8E7D6C5B4A3902L;
    public static long p2 = 0x1234567890ABCEF1L;
    public static long p3 = 0x0FEDCBA987654321L;
    public static long p4 = 0xABCDEFFEDCBA1234L;
    public static long p5 = 0x7890123456ACDEF1L;
    public static long p6 = 0x4567890ABCDEF234L;
    public static long p7 = 0xCDEF0123456789ABL;
    public static long p8 = 0x9876543210FEDCBAL;
    public static long p9 = 0x1122334455667788L;
    public static long p10 = 0x99AABBCCDDEEFF00L;
    public static long p11 = 0x00FFEEDDCCBBAA99L;
    public static long p12 = 0x13579BDF2468ACE0L;
    public static long p13 = 0xFACEB00CDEADBEAFL;
    public static long p14 = 0xCAFEBABEDEADC0DEL;
    public static long p15 = 0xFEEDFACEBADF00D5L;

    public static long p16 = 0x1BADB002FACEEAF0L;
    public static long p17 = 0xBADDCAFE13579ACEL;
    public static long p18 = 0xC0FFEE123456789AL;
    public static long p19 = 0x0BADF00DDEADBEEFL;
    public static long p20 = 0x1234567890ABCDEFL;
    public static long p21 = 0xFEEDFACECAFEBABEL;
    public static long p22 = 0xBADB0021FACEDEAFL;
    public static long p23 = 0x1234CDEF56789AB4L;
    public static long p24 = 0xACE13579BDF24680L;
    public static long p25 = 0xDEADBEEF13579BDFL;
    public static long p26 = 0xCAFEBABE09876543L;
    public static long p27 = 0xF00DFACEDEADC0DEL;
    public static long p28 = 0xBABEFACEBADC0FF1L;
    public static long p29 = 0x1337CAFEBABE0000L;
    public static long p30 = 0xBAADF00DCAFEBABEL;
    public static long p31 = 0x13579ACE2468BDF0L;


    public static long c0  = 0x83823efda40077feL;
    public static long c1  = 0x11945d160c68f6baL;
    public static long c2  = 0x8df64d7e8d2827a1L;
    public static long c3  = 0x0db3b2f70524526eL;
    public static long c4  = 0xdc609c2d62a1fba5L;
    public static long c5  = 0xdcd4cfb55c244cfcL;
    public static long c6  = 0x572ebb2f5dd429dfL;
    public static long c7  = 0x2bc919d888ab55ddL;
    public static long c8  = 0xc793453ec662a2f3L;
    public static long c9  = 0x87cb8c778e19d161L;
    public static long c10 = 0x27970c8c32cc4760L;
    public static long c11 = 0x399e8913faa24f7aL;
    public static long c12 = 0x842efcd3f35cbca9L;
    public static long c13 = 0x143e2fbb84990c2fL;
    public static long c14 = 0x6ca15a0e787c2202L;
    public static long c15 = 0x0d861b225c8b4253L;
    public static long c16 = 0x1af00e9e1603f275L;
    public static long c17 = 0x330a7289e179a3f7L;
    public static long c18 = 0xe815461dc57f1997L;
    public static long c19 = 0x7d148731fd10e455L;
    public static long c20 = 0xf43ae3eeb56e2bbfL;
    public static long c21 = 0xa4df544acd0bcfc3L;
    public static long c22 = 0xe5f41f3b19a626f3L;
    public static long c23 = 0x23494ae2cc430a12L;
    public static long c24 = 0x5e3c1aa903d2b8bcL;
    public static long c25 = 0xce75309e23088feeL;
    public static long c26 = 0x040dc1cd88f76f3eL;
    public static long c27 = 0x01572c3fcc3af4e0L;
    public static long c28 = 0xcc7899830ab289faL;
    public static long c29 = 0xbe97bc0c751e5678L;
    public static long c30 = 0x2a3c032d8a6b7bdeL;
    public static long c31 = 0xa0ca41b38d483b6cL;



    private static final ArrayList<List<Long>> cipherTexts = new ArrayList<List<Long>>();
    private static final ArrayList<List<Long>> plainTexts = new ArrayList<List<Long>>();


    public static void main(String[] args) {



        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c0, (long) c1)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c2, (long) c3)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c4, (long) c5)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c6, (long) c7)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c8, (long) c9)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c10, (long) c11)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c12, (long) c13)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c14, (long) c15)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c16, (long) c17)));

        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c18, (long) c19)));

        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c20, (long) c21)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c22, (long) c23)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c24, (long) c25)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c26, (long) c27)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c28, (long) c29)));
        cipherTexts.add(new ArrayList<>(Arrays.asList((long) c30, (long) c31)));


        plainTexts.add(new ArrayList<>(Arrays.asList((long) p0, (long) p1)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p2, (long) p3)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p4, (long) p5)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p6, (long) p7)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p8, (long) p9)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p10, (long) p11)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p12, (long) p13)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p14, (long) p15)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p16, (long) p17)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p18, (long) p19)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p20, (long) p21)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p22, (long) p23)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p24, (long) p25)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p26, (long) p27)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p28, (long) p29)));
        plainTexts.add(new ArrayList<>(Arrays.asList((long) p30, (long) p31)));



        int[] k3Values = {0x4f238976, 0xcfa309f6, 0x4f2309f6, 0xcfa38976};
        int[] k2Values = {
                0x9f22e41,
                0x9f2aec1,
                0x89722e41,
                0x8972aec1
        };
        int[] k1Values = {
                0xc79f87fe, 0x471f077e, 0xc79f87fc, 0x471f077c,
                0xc59f87fe, 0x451f077e, 0xc59f87fc, 0x451f077c,
                0xc79f077e, 0x471f87fe, 0xc79f077c, 0x471f87fc,
                0xc59f077e, 0x451f87fe, 0xc59f077c, 0x451f87fc
        };
        int[] k0Values = {
                0x98c2148, 0x890ca1c8, 0x98c214a, 0x890ca1ca, 0x8b0ca1c8,
                0xb8c2148, 0x8b0ca1ca, 0xb8c214a, 0x98ca1c8, 0x890c2148,
                0x98ca1ca, 0x890c214a, 0x8b0c2148, 0xb8ca1c8, 0x8b0c214a, 0xb8ca1ca
        };

        //primaryPhase(c0, c1, );
        for (int k3: k3Values)
        {
            for (int k2: k2Values)
            {
                for(int k1: k1Values)
                {
                    for (int k0: k0Values)
                    {
                        primaryPhase(c0, c1,k3, k2, k1, p1, p2, k0);
                    }
                }
            }
        }

        //System.out.println(k4.size());
        //System.out.println(k5.size());



/*
        for (Map.Entry<Object, Integer> entry : k4.entrySet()) {
            System.out.println("Key: " + Integer.toHexString((int)entry.getKey()) + ", Value: " + (int) entry.getValue());
        }



        System.out.println("                                                kajsndkjasndkkansmdklmn                                   ");
        for (Map.Entry<Object, Integer> entry : k5.entrySet()) {
            System.out.println("Key: " + Integer.toHexString((int)entry.getKey()) + ", Value: " + (int) entry.getValue());
        }*/


        List<Integer> k4_Final = new ArrayList<>();
        List<Integer> k5_Final = new ArrayList<>();




        // Add keys to the list after casting them to Integer
        for (Object key : k4.keySet()) {
            if (key instanceof Integer) {
                k4_Final.add((Integer) key);
                System.out.println("Possible Keys for K4 "+ Integer.toHexString((Integer) key));
            }
        }
        System.out.println(" \n\n\n\n ");
        //System.out.println("                                             break                                                 sajlkdmsklandmjasjndljasnlkdmaslkd\n");
        for (Object key : k5.keySet()) {
            if (key instanceof Integer) {
                k5_Final.add((Integer) key);
                System.out.println("Possible Keys for K5 " +Integer.toHexString((Integer) key));
            }
        }

/*        byte[] data = new byte[8];

      data[0] = (byte) (0x10000000);
        data[1] = (byte) (0x10000000);
        data[2] = (byte) (0x10000000);
        data[3] = (byte) (0x10000000);
        data[4] = (byte) (0x10000000);
        data[5] = (byte) (0x10000000);
        data[6] = (byte) (0x10000000);
        data[7] = (byte) (0x10000000);*/

        byte[] data = new byte[8];
        long value = 0x1A2B3C4D5E6F7081L;

        data[0] = (byte) ((value >> 56) & 0xFF); // Most significant byte
        data[1] = (byte) ((value >> 48) & 0xFF);
        data[2] = (byte) ((value >> 40) & 0xFF);
        data[3] = (byte) ((value >> 32) & 0xFF);
        data[4] = (byte) ((value >> 24) & 0xFF);
        data[5] = (byte) ((value >> 16) & 0xFF);
        data[6] = (byte) ((value >> 8) & 0xFF);
        data[7] = (byte) (value & 0xFF);


        long c0 = 0x83823efda40077feL; // Given long value
        byte[] data_Cipher = new byte[8];

        // Extract each byte from the long value
        data_Cipher[0] = (byte) ((c0 >> 56) & 0xFF); // Most significant byte
        data_Cipher[1] = (byte) ((c0 >> 48) & 0xFF);
        data_Cipher[2] = (byte) ((c0 >> 40) & 0xFF);
        data_Cipher[3] = (byte) ((c0 >> 32) & 0xFF);
        data_Cipher[4] = (byte) ((c0 >> 24) & 0xFF);
        data_Cipher[5] = (byte) ((c0 >> 16) & 0xFF);
        data_Cipher[6] = (byte) ((c0 >> 8) & 0xFF);
        data_Cipher[7] = (byte) (c0 & 0xFF);         // Least significant byte

        // Print the resulting array for verification
        for (byte b : data) {
            System.out.printf("0x%02X ", b);
        }

/*        *//* Not the keys you are looking for!!! *//*
        for (int k3:k3Values)
        {
            for (int k2: k2Values)
            {
                for (int k1: k1Values)
                {
                    for (int k0: k0Values)
                    {
                        for(int i=0; i<256; i++)
                        {
                            int[] key ={k0,k1,k2,k3, k4_Final.get(i), k5_Final.get(i)};
                            data[0] = (byte) ((value >> 56) & 0xFF); // Most significant byte
                            data[1] = (byte) ((value >> 48) & 0xFF);
                            data[2] = (byte) ((value >> 40) & 0xFF);
                            data[3] = (byte) ((value >> 32) & 0xFF);
                            data[4] = (byte) ((value >> 24) & 0xFF);
                            data[5] = (byte) ((value >> 16) & 0xFF);
                            data[6] = (byte) ((value >> 8) & 0xFF);
                            data[7] = (byte) (value & 0xFF);
                            encrypt(data,key);
                            //System.out.println("Keys "+Integer.toHexString(key[0])+"  "+Integer.toHexString(key[1])+"  "+Integer.toHexString(key[2])+"  "+Integer.toHexString(key[3])+"  "+Integer.toHexString(key[4])+"  "+Integer.toHexString(key[5]));
                            boolean areEqual = compareArrays(data, data_Cipher);
                            if (areEqual) {
                                System.out.println("Arrays are equal.  siuuuu"); }

                            //System.out.print("Plaintext=  ");
                            //for (int i1=0;i<8;i++) System.out.printf("%02x",data[i]);

                            data[0] = (byte) ((value >> 56) & 0xFF); // Most significant byte
                            data[1] = (byte) ((value >> 48) & 0xFF);
                            data[2] = (byte) ((value >> 40) & 0xFF);
                            data[3] = (byte) ((value >> 32) & 0xFF);
                            data[4] = (byte) ((value >> 24) & 0xFF);
                            data[5] = (byte) ((value >> 16) & 0xFF);
                            data[6] = (byte) ((value >> 8) & 0xFF);
                            data[7] = (byte) (value & 0xFF);
                            for (int i1=0;i<8;i++) System.out.printf("%02x",data[i]);


                        }
                    }
                }
            }
        }*/


/*        System.out.print("Plaintext=  ");
        for (int i=0;i<8;i++) System.out.printf("%02x",data[i]);
        System.out.print("\n");

        encrypt(data,key);
        System.out.print("Ciphertext= ");
        for (int i=0;i<8;i++) System.out.printf("%02x",data[i]);
        System.out.print("\n");

*//*        decrypt(data,key);
        System.out.print("Plaintext=  ");
        for (int i=0;i<8;i++) System.out.printf("%02x",data[i]);
        System.out.print("\n");*//*

        boolean areEqual = compareArrays(data, data_Cipher);

        // Print result
        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }*/

    }

    public static boolean compareArrays(byte[] array1, byte[] array2) {
        // Check length first
        if (array1.length != array2.length) {
            return false;
        }

        // Compare each element
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true; // All elements match
    }

    public static void k3Cleaning(int matches, HashMap<Object, Integer> k3)
    {

        // Remove entries that don't have value 4
        k3.entrySet().removeIf(entry -> entry.getValue() != matches);
        System.out.println("completed");

        for (Map.Entry<Object, Integer> entry : k3.entrySet()) {
            System.out.println("Key: " + Integer.toHexString((int)entry.getKey()) + ", Value: " + Integer.toHexString((int) entry.getValue()));
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





    public static void primaryPhase(long cip0, long cip1, long key, long k2Val, long k1Val, long p1, long p2, long k0)
    {
        long y0, y1, z_dash, l0, l1, r0, r1;

        int[] p0_splits = splitTo32Bits(cip0);
        int[] p1_splits = splitTo32Bits(cip1);


        l0 = p0_splits[0];
        r0 = p0_splits[1];
       /* System.out.println("l0 " + Integer.toHexString((int) l0));
        System.out.println("r0 " + Integer.toHexString((int) r0));*/
/*      System.out.println("l0 " + Integer.toHexString(p0_splits[0]));
        System.out.println("r0 " + Integer.toHexString(p0_splits[1]));*/


        l1 = p1_splits[0];
        r1 = p1_splits[1];
       /* System.out.println("l1 " + Integer.toHexString((int) l1));
        System.out.println("r1 " + Integer.toHexString((int) r1));*/


        y0 = l0 ^ r0;
        long prev_y0 = y0;
        y0 = y0 ^ key;
        y0 = f((int) y0);
        y0 = y0 ^ l0;
        long k2Prev_y0 = y0;
        y0 = y0 ^ k2Val;
        y0 = f((int) y0);
        y0 = prev_y0 ^ y0;
        long k1Prev_y0 = y0;
        y0 = y0 ^ k1Val;
        y0 = f((int) y0);
        y0 = k2Prev_y0 ^ y0;
        long k0Prev_y0 = y0;
        y0 = y0 ^ k0;
        y0 = f((int) y0);
        y0 = y0 ^ k1Prev_y0;
        long L0 = y0;
        long R0 = k0Prev_y0 ^ L0;


        y1 = l1 ^ r1;
        long prev_y1 = y1;
        y1 = y1 ^ key;
        y1 = f((int) y1);
        y1 = y1 ^ l1;
        long k2Prev_y1 = y1;
        y1 = y1 ^ k2Val;
        y1 = f((int) y1);
        y1 = prev_y1 ^ y1;
        long k1Prev_y1 = y1;
        y1 = y1 ^ k1Val;
        y1 = f((int) y1);
        y1 = k2Prev_y1 ^ y1;
        long k0Prev_y1 = y1;
        y1 = y1 ^ k0;
        y1 = f((int) y1);
        y1 = y1 ^ k1Prev_y1;
        long L1 = y1;
        long R1 = k0Prev_y1 ^ L1;



        int[] pla0_splits = splitTo32Bits(p1);
        int[] pla1_splits = splitTo32Bits(p2);

        int LeftValue= (int) (pla0_splits[0] ^ L0);
        int rightValue = (int) (pla0_splits[1] ^ R0);

        k4.put(LeftValue, 1);
        k5.put(rightValue,1);




    }
    static void encrypt(byte data[],int key[]) {
        int left,right,temp;

        left=pack(data,0)^key[4];
        right=left^pack(data,4)^key[5];

        for (int i=0;i<rounds;i++) {
            temp=right;
            right=left^f(right^key[i]);
            left=temp;
        }

        left^=right;

        unpack(right,data,0);
        unpack(left,data,4);
    }

    static void decrypt(byte data[],int key[]) {
        int left,right,temp;

        right=pack(data,0);
        left=right^pack(data,4);

        for (int i=0;i<rounds;i++) {
            temp=left;
            left=right^f(left^key[rounds-1-i]);
            right=temp;
        }

        right^=left;

        left^=key[4];
        right^=key[5];
        unpack(left,data,0);
        unpack(right,data,4);
    }



    public static List<Integer> findMatchingValues(List<Integer> list1, List<Integer> list2,
                                                   List<Integer> list3, List<Integer> list4)
    {
        List<Integer> matchingValues = new ArrayList<>();

        // Iterate over the first list and check if the element is in all other lists
        for (Integer value : list1) {
            if (list2.contains(value) && list3.contains(value) && list4.contains(value)) {
                matchingValues.add(value);
            }
        }

        return matchingValues;
    }
}
