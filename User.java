import javax.persistence.*;
import java.util.Set;

// Assuming Paiement is in the same package or provide the correct package name
import com.example.package.Paiement;  // Modifier avec le bon package si nécessaire
import com.example.package.CB;        // Ajouter l'import pour CB

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "user")
    private Set<Solde> soldes;

    @OneToMany(mappedBy = "user")
    private Set<Depense> depenses;

    @ManyToMany
    @JoinTable(name = "user_tricount", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "tricount_id"))
    private Set<Tricount> tricounts;

    @OneToMany(mappedBy = "user")
    private Set<Paiement> paiements;  // Corrigé "Paiment" en "Paiement"

    @ManyToOne
    @JoinColumn(name = "cb_id")
    private CB cb;

 

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Solde> getSoldes() {
        return soldes;
    }

    public void setSoldes(Set<Solde> soldes) {
        this.soldes = soldes;
    }

    public Set<Depense> getDepenses() {
        return depenses;
    }

    public void setDepenses(Set<Depense> depenses) {
        this.depenses = depenses;
    }

    public Set<Tricount> getTricounts() {
        return tricounts;
    }

    public void setTricounts(Set<Tricount> tricounts) {
        this.tricounts = tricounts;
    }

    public Set<Paiement> getPaiements() {  // Corrigé "getPaiments" en "getPaiements"
        return paiements;
    }

    public void setPaiements(Set<Paiement> paiements) {  // Corrigé "setPaiments" en "setPaiements"
        this.paiements = paiements;
    }

    public CB getCb() {
        return cb;
    }

    public void setCb(CB cb) {
        this.cb = cb;
    }
}
