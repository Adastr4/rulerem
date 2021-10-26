package it.profilglass.orm;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.sun.istack.NotNull;

@Entity
@Table(name="conf_distinta")
public class DistintaOrm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DistintaOrmIdentity identity;
	
	@NotNull
	@Column(name="CodiceArticoloPadre", insertable=false, updatable=false)
	private String codiceArticoloPadre;
	
	@NotNull
	@Column(name="Revisione", insertable=false, updatable=false)
	private int revisione;
	
	@NotNull
	@Column(name="Posizione", insertable=false, updatable=false)
	private int posizione;
	
	@NotNull
	@Column(name="CodiceArticoloFiglio", insertable=false, updatable=false)
	private String codiceArticoloFiglio;
	
	@NotFound(action = NotFoundAction.IGNORE)
	@ManyToOne
	@JoinColumn(name = "CodiceArticoloPadre")
	private DistintaOrm fatherObj;
	
	@OneToMany(mappedBy = "fatherObj", fetch = FetchType.EAGER)
    private List<DistintaOrm> figlioObj;
	
	@NotNull
	@Column(name="Qta")
	private float qta;
	
	@NotNull
	@Column(name="Scarto")
	private float scarto;
	
	@NotNull
	@Column(name="Magazzino")
	private String magazzino;
	
	@NotNull
	@Column(name="Operazione")
	private int operazione;

	public DistintaOrm(DistintaOrmIdentity identity, String codiceArticoloPadre, int revisione, int posizione,
			String codiceArticoloFiglio, DistintaOrm fatherObj, List<DistintaOrm> figlioObj, float qta, float scarto,
			String magazzino, int operazione) {
		super();
		this.identity = identity;
		this.codiceArticoloPadre = codiceArticoloPadre;
		this.revisione = revisione;
		this.posizione = posizione;
		this.codiceArticoloFiglio = codiceArticoloFiglio;
		this.fatherObj = fatherObj;
		this.figlioObj = figlioObj;
		this.qta = qta;
		this.scarto = scarto;
		this.magazzino = magazzino;
		this.operazione = operazione;
	}
	
	public DistintaOrm() {
		this.identity = null;
		this.codiceArticoloPadre = "";
		this.revisione = 0;
		this.posizione = 0;
		this.codiceArticoloFiglio = "";
		this.fatherObj = null;
		this.figlioObj = null;
		this.qta = 0;
		this.scarto = 0;
		this.magazzino = "";
		this.operazione = 0;
	}

	public DistintaOrmIdentity getIdentity() {
		return identity;
	}

	public void setIdentity(DistintaOrmIdentity identity) {
		this.identity = identity;
	}

	public String getCodiceArticoloPadre() {
		return codiceArticoloPadre;
	}

	public void setCodiceArticoloPadre(String codiceArticoloPadre) {
		this.codiceArticoloPadre = codiceArticoloPadre;
	}

	public int getRevisione() {
		return revisione;
	}

	public void setRevisione(int revisione) {
		this.revisione = revisione;
	}

	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public String getCodiceArticoloFiglio() {
		return codiceArticoloFiglio;
	}

	public void setCodiceArticoloFiglio(String codiceArticoloFiglio) {
		this.codiceArticoloFiglio = codiceArticoloFiglio;
	}

	public DistintaOrm getFatherObj() {
		return fatherObj;
	}

	public void setFatherObj(DistintaOrm fatherObj) {
		this.fatherObj = fatherObj;
	}

	public List<DistintaOrm> getFiglioObj() {
		return figlioObj;
	}

	public void setFiglioObj(List<DistintaOrm> figlioObj) {
		this.figlioObj = figlioObj;
	}

	public float getQta() {
		return qta;
	}

	public void setQta(float qta) {
		this.qta = qta;
	}

	public float getScarto() {
		return scarto;
	}

	public void setScarto(float scarto) {
		this.scarto = scarto;
	}

	public String getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(String magazzino) {
		this.magazzino = magazzino;
	}

	public int getOperazione() {
		return operazione;
	}

	public void setOperazione(int operazione) {
		this.operazione = operazione;
	}
}
