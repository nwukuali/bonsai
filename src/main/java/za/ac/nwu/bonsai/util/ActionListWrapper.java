package za.ac.nwu.bonsai.util;

public class ActionListWrapper {

    private String details;

    //Lightbox component variables to customize view
    private String name;
    private String surname;

    private String documentId;
    private String requestingUserId;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getRequestingUserId() {
        return requestingUserId;
    }

    public void setRequestingUserId(String requestingUserId) {
        this.requestingUserId = requestingUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
