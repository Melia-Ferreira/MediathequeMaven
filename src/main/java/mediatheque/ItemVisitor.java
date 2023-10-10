package mediatheque;

public interface ItemVisitor { //instancie chaque type que l'on veut traiter
    public void visit(Book b);
    public void visit(CD c);
}
