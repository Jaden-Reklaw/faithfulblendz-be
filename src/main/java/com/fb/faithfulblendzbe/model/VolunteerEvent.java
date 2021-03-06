package com.fb.faithfulblendzbe.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "volunteer_event")
public class VolunteerEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VolunteerEventId")
    private Integer id;

    @Version
    private Integer version;

    private String volunteerEventName;
    private String volunteerEventUrl;
    private String volunteerEventDescription;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;

    private Date startDateTime;
    private Date endDateTime;

    public VolunteerEvent(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getVolunteerEventName() {
        return volunteerEventName;
    }

    public void setVolunteerEventName(String volunteerEventName) {
        this.volunteerEventName = volunteerEventName;
    }

    public String getVolunteerEventUrl() {
        return volunteerEventUrl;
    }

    public void setVolunteerEventUrl(String volunteerEventUrl) {
        this.volunteerEventUrl = volunteerEventUrl;
    }

    public String getVolunteerEventDescription() {
        return volunteerEventDescription;
    }

    public void setVolunteerEventDescription(String volunteerEventDescription) {
        this.volunteerEventDescription = volunteerEventDescription;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }
}