class GoodDogTestDrive
{
    public static void main (String[] args)
    {

    class GoodDog
    {
    private int size;

    public int getSize()
    {
        return size;
    }

    public void setSize(int s)
    {
        size = s;
    }

    void bark()
    {
        if (size >60)
        {      
            System.out.println(" Woof, Woof, Woof !!!");
        } else if (size>14)
        {
            System.out.println("Ruff, Ruffy!");
        } else 
        {
            System.out.println("Yiip"); 
        }
}


}


        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
       System.out.println("Dog one:" + one.getSize());
       System.out.println("Dog one:" + two.getSize());
       one.bark();
       two.bark(); 
    }

}
