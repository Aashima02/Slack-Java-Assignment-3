public abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class Novel extends Book
{
    public void setTitle(String s)
    {
        this.title=s;
    }
}