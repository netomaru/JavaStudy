public class poorDogTestDrive
{
    public static void main(String[] args)
    {
        class poorDog
        {
            private int size;
            private String name;

            public int getSize()
            {
                return size;
            }
            public String getName()
            {
                return name;
            }

        }

        poorDog one = new poorDog();
        System.out.println("The size of dog is" + one.getSize());
        System.out.println("The name of dog is" + one.getName());




    }









}