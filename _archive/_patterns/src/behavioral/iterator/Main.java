package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator i = nameRepository.getIterator(); i.hasNext();) {
            System.out.println((String)i.next());
        }

    }
}
