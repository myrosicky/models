package org.business.models.applysystem;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
@NamedEntityGraph(name = "fetchApply", attributeNodes = {@NamedAttributeNode("apply")})
public class Approve implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String TYPE_APPROVE = "1";
    public static final String TYPE_REVIEW = "2";
    
    public static final String RESULT_SAVE = "1";
    public static final String RESULT_PASS = "2";
    public static final String RESULT_FAIL = "3";
    
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column
    private String time;

    @Column
    private long approverID;

    @Column
    private long applyID;

    @Column
    private String comment;

    @Column
    private String result;
    
    @Column
    private String type;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id", insertable=false, updatable=false)
    private Apply apply;
    

}
