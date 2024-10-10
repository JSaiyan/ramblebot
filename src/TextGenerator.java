import java.util.List;
import java.util.Scanner;

public interface TextGenerator {
  public void train(Scanner scanner);
  public String predictNextWord(List<String> context);
}