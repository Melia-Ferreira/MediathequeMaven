package mediatheque;

public class PrintCatalogue implements ItemVisitor{
    @Override
    public void visit(Book b) {
        System.out.println(b.toString());
    }

    @Override
    public void visit(CD c) {
        System.out.println(c.toString());

    }
}
