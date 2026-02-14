package DesignPatterns.PrototypePattern;

public class Main {
    public static void main(String[] args) {
//        GameCharacter gameCharacter = new GameCharacter("Human", 100);
//        System.out.println("Type is : " + gameCharacter.getType());
//
//        GameCharacter clone1 = (GameCharacter) gameCharacter.clone();
        Size size = new Size(100);
        Document document = new Document("Title", "Content", Document.DocumentStyles.Squared, size);

        Document document1 = (Document) document.clone();
        document1.setSize(200);

        System.out.println("Size is : " + document.getSize().getValue());
        System.out.println("Size is : " + document1.getSize().getValue());

    }
}
