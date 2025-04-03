package Chapter_6;

public class Magazine implements Printable{
    private String title;
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        if (!title.trim().isEmpty()
                && title != null && issueNumber > 0) {
            this.title = title;
            this.issueNumber = issueNumber;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.trim().isEmpty() && title != null) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0 && issueNumber < 100) {
            this.issueNumber = issueNumber;
        } else {
            throw new IllegalArgumentException("Введите корректные данные");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Magazine: " + title + ", Issue #" +  issueNumber);
    }

}
