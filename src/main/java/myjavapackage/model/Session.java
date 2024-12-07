/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavapackage.model;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.model.ScrudBean;
import com.github.manosbatsis.scrudbeans.model.AbstractHibernateModel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 *
 * @author Ashlee Campaz
 */
@Entity
@Table (name = "Session")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@ScrudBean
@Schema(name = "Session", description = "A model representing an basic session")
public class Session extends AbstractHibernateModel<String>{
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String title;
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "lecture_id") // Especifica la clave foránea
    private Lecturer lecturer;
    private LocalDateTime date;
    private double duration; 
    
    @ManyToOne
    @JoinColumn(name = "conference_id") // Especifica la clave foránea
    private Conference conference; 
}
