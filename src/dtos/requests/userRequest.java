package dtos.requests;

public class userRequest {
    private String viewMail;
    private String deleteMail;
    private String sendMail;
    private String viewTotalMail;

    public String getViewMail() {
        return viewMail;
    }

    public void setViewMail(String viewMail) {
        this.viewMail = viewMail;
    }

    public String getDeleteMail() {
        return deleteMail;
    }

    public void setDeleteMail(String deleteMail) {
        this.deleteMail = deleteMail;
    }

    public String getSendMail() {
        return sendMail;
    }

    public void setSendMail(String sendMail) {
        this.sendMail = sendMail;
    }

    public String getViewTotalMail() {
        return viewTotalMail;
    }

    public void setViewTotalMail(String viewTotalMail) {
        this.viewTotalMail = viewTotalMail;
    }
}
