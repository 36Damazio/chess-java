package boardgame;

public class BoardExcepition extends RuntimeException {
  private static final long serialVersionUID = 1l;

  public BoardExcepition(String msg) {
    super(msg);
  }

}
