package com.example.SpringProject.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.sql.Date;

@Entity
@Data
@NoArgsConstructor(force = true)
@Table(name="DEMAND_REQUEST")
public class DemandRequest {
    @Id
    @Column(name="REQ_ID")
    private String reqId;

    @NonNull
    @Column(name="ROLE")
    private String role;

    @NonNull
    @Column(name="TECHNOLOGY")
    private String technology;

    @NonNull
    @Column(name="REQUESTED_BY")
    private String requestedBy;

    @Column(name="PROJECT",length =40)
    private String project;

    @Column(name="OPERATING_UNIT",length =40)
    private String operatingUnit;

    @NonNull
    @Column(name="REF_COMM_NO",length =15)
    private String refCommNo;

    @Transient
    private Integer noOfResources;

    @NonNull
    @Column(name="DEMAND_LEVEL")
    private String demandLevel;

    @NonNull
    @Column(name="REQUESTING_TM",length =40)
    private String requestingTm;

    @NonNull
    @Column(name="RESPONSIBLE_TM",length =40)
    private String responsibleTm;

    @NonNull
    @Column(name="REQUESTED_DATE")
    private Date requestedDate;

    @NonNull
    @Column(name="TARGET_DATE")
    private Date targetDate;

    @Column(name="COMMENTS")
    private String comments;

    @Column(name="STATUS")
    private String status;

    @Column(name="OFFERED_DATE")
    private String offeredDate;

    @Column(name="OFFER_SLA_MET")
    private String offerSlaMet;

    @Column(name="DOJ_OFFER_LETTER")
    private String DojOfferLetter;

    @Column(name="ACTUAL_JOINING_DATE")
    private String actualJoiningDate;

    @Column(name="REQUEST_TO_OFFER")
    private String requestToOffer;

    @Column(name="REQUEST_TO_JOINING")
    private String requestToJoining;

    @Column(name="RESOURCE_NAME",length =40)
    private String resourceName;

    @Column(name="REMARKS",length =400)
    private String remarks;

    @Transient
    private Integer fromDate;

    @Transient
    private Integer toDate;





}
