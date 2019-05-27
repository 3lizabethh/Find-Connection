public class EmptyStackException extends RuntimeException
{
  /**
   * Sets up this exception with an appropriate message.
   * @param message explains the error that threw the exception
   */
  public EmptyStackException (String message)
  {
    super ("The" +message+"is empty.");
  }
}