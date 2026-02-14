package DesignPatterns.PrototypePattern;

public class Document implements Prototype {
    public enum DocumentStyles {
        Squared,
        Gothic,
        SansSerif,
    }
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStyles(DocumentStyles styles) {
        this.styles = styles;
    }

    public String getContent() {
        return content;
    }

    public DocumentStyles getStyles() {
        return styles;
    }

    private String content;
    private DocumentStyles styles;
    private Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size.setValue(size);
    }

    public Document(String title, String content, DocumentStyles styles, Size size){
        this.title = title;
        this.content = content;
        this.styles = styles;
        this.size = size;
    }


    @Override
    public Prototype clone() {
        return new Document(this.title, this.content, this.styles, this.size);
    }

}
