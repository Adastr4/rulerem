package it.profilglass.classmodel;

import java.util.ArrayList;
import java.util.List;

public class Distinta<LivelloDistinta> {
	 
	private List<Distinta<LivelloDistinta>> children = new ArrayList<Distinta<LivelloDistinta>>();
    private Distinta<LivelloDistinta> parent = null;
    private LivelloDistinta data = null;

    public Distinta()
    {
    	this.data = null;
    }
    
    public Distinta(LivelloDistinta data) {
        this.data = data;
    }

    public Distinta(LivelloDistinta data, Distinta<LivelloDistinta> parent) {
        this.data = data;
        this.parent = parent;
    }

    public List<Distinta<LivelloDistinta>> getChildren() {
        return children;
    }

    public void setParent(Distinta<LivelloDistinta> parent) {
        parent.addChild(this);
        this.parent = parent;
    }

    public void addChild(LivelloDistinta data) {
        Distinta<LivelloDistinta> child = new Distinta<LivelloDistinta>(data);
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(Distinta<LivelloDistinta> child) {
        child.setParent(this);
        this.children.add(child);
    }

    public LivelloDistinta getData() {
        return this.data;
    }

    public void setData(LivelloDistinta data) {
        this.data = data;
    }

    public boolean isRoot() {
        return (this.parent == null);
    }

    public boolean isLeaf() {
        return this.children.size() == 0;
    }

    public void removeParent() {
        this.parent = null;
    }
	 
}
