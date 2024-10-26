public class Main
{
    public static void main(String[] args)
    {
        Pair<Integer> pInteger = new Pair<>(2, 3);
        Pair<Double> pDouble = new Pair<>(1.5, 2.5);
        Pair<String> pString = new Pair<String>("Andrzej", "Bartek");

        printNumbers(pInteger);
        printNumbers(pDouble);
        //printNumbers(pString);

        printGenerics(pInteger);
        printGenerics(pDouble);
        //printGenerics(pString);

        printSuper(pInteger);
        //printSuper(pDouble);
        //printSuper(pString);

        swap(pDouble);
        System.out.println(pDouble);
    }
    public static void printNumbers(Pair<? extends Number> pair)
    {
        System.out.println(pair);
    }
    public static <T extends Number> void printGenerics(Pair<T> pair)
    {
        System.out.println(pair);
    }
    public static void printSuper(Pair<? super Integer> pair)
    {
        pair.setFirst(5);
        System.out.println(pair);
        System.out.println(pair.getFirst().getClass().getName());
    }
    public static void swap(Pair<?> pair)
    {
        swapHelper(pair);
    }
    public static <T> void swapHelper(Pair<T> pair)
    {
        T first = pair.getFirst();
        pair.setFirst(pair.getSecond());
        pair.setSecond(first);
    }
}