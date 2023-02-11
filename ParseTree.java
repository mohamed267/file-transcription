import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseTree {
    private String label;
    private List<ParseTree> children;
    private boolean isTerminal;

    public ParseTree(String label, boolean isTerminal) {
        this.label = label;
        this.isTerminal = isTerminal;
        this.children = new ArrayList<>();
    }

    public void addChild(ParseTree child) {
        this.children.add(child);
    }

    public String getLabel() {
        return this.label;
    }

    public List<ParseTree> getChildren() {
        return this.children;
    }

    public boolean isTerminal() {
        return this.isTerminal;
    }

    public void writeNode(FileWriter writer) throws IOException {
        writeNode(writer, "");
    }

    private void writeNode(FileWriter writer, String prefix) throws IOException {
        writer.write(prefix + this.label + "\n");
        for (ParseTree child : this.children) {
            child.writeNode(writer, prefix + "  ");
        }
    }
}
