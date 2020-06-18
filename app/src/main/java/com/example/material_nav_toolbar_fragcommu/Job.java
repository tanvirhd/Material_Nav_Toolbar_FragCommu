package com.example.material_nav_toolbar_fragcommu;
public class Job{

    private String jobid;

    private String jodTitle;
    private String jobDetails;
    private String applicationStartDate;
    private String applicationEndDate;
    private String jobCircularPicUrl;
    private String jobCircularPublicationDate;
    private boolean multipleCategoryApply;
    private String message;

    public Job() {
        //blank constructor
    }


    public Job(String jobid, String jodTitle, String jobDetails, String applicationStartDate, String applicationEndDate, String jobCircularPicUrl, String jobCircularPublicationDate, boolean multipleCategoryApply) {
        this.jobid = jobid;
        this.jodTitle = jodTitle;
        this.jobDetails = jobDetails;
        this.applicationStartDate = applicationStartDate;
        this.applicationEndDate = applicationEndDate;
        this.jobCircularPicUrl = jobCircularPicUrl;
        this.jobCircularPublicationDate = jobCircularPublicationDate;
        this.multipleCategoryApply = multipleCategoryApply;
    }

    public boolean isMultipleCategoryApply() {
        return multipleCategoryApply;
    }

    public void setMultipleCategoryApply(boolean multipleCategoryApply) {
        this.multipleCategoryApply = multipleCategoryApply;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public String getJodTitle() {
        return jodTitle;
    }

    public void setJodTitle(String jodTitle) {
        this.jodTitle = jodTitle;
    }

    public String getJobDetails() {
        return jobDetails;
    }

    public void setJobDetails(String jobDetails) {
        this.jobDetails = jobDetails;
    }

    public String getApplicationStartDate() {
        return applicationStartDate;
    }

    public void setApplicationStartDate(String applicationStartDate) {
        this.applicationStartDate = applicationStartDate;
    }

    public String getApplicationEndDate() {
        return applicationEndDate;
    }

    public void setApplicationEndDate(String applicationEndDate) {
        this.applicationEndDate = applicationEndDate;
    }

    public String getJobCircularPicUrl() {
        return jobCircularPicUrl;
    }

    public void setJobCircularPicUrl(String jobCircularPicUrl) {
        this.jobCircularPicUrl = jobCircularPicUrl;
    }

    public String getJobCircularPublicationDate() {
        return jobCircularPublicationDate;
    }

    public void setJobCircularPublicationDate(String jobCircularPublicationDate) {
        this.jobCircularPublicationDate = jobCircularPublicationDate;
    }
}

