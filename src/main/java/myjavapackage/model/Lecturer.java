/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavapackage.model;

import com.github.manosbatsis.scrudbeans.api.mdd.annotation.model.ScrudBean;
import com.github.manosbatsis.scrudbeans.model.AbstractHibernateModel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table (name = "Lecturer")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@ScrudBean
@Schema(name = "Lecturer", description = "A model representing an basic lecturer")
public class Lecturer extends AbstractHibernateModel<String>{
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String name;
    private String lastName;
    private String email;
    private String organization;
    private String researchfields; 
    
    @OneToMany(mappedBy = "lecturer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Session> sessions; 
}
