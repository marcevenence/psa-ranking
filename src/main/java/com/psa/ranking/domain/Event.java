package com.psa.ranking.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import com.psa.ranking.domain.enumeration.Status;

/**
 * Event entity.\n@author Marcelo Miño
 */
@Entity
@Table(name = "event")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "play_date")
    private Instant playDate;

    @Column(name = "end_inscription_date")
    private Instant endInscriptionDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "create_date")
    private Instant createDate;

    @Column(name = "updated_date")
    private Instant updatedDate;

    @ManyToOne
    @JsonIgnoreProperties("events")
    private Tournament tournament;

    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JoinTable(name = "event_category",
               joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"),
               inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"))
    private Set<Category> categories = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Event name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getPlayDate() {
        return playDate;
    }

    public Event playDate(Instant playDate) {
        this.playDate = playDate;
        return this;
    }

    public void setPlayDate(Instant playDate) {
        this.playDate = playDate;
    }

    public Instant getEndInscriptionDate() {
        return endInscriptionDate;
    }

    public Event endInscriptionDate(Instant endInscriptionDate) {
        this.endInscriptionDate = endInscriptionDate;
        return this;
    }

    public void setEndInscriptionDate(Instant endInscriptionDate) {
        this.endInscriptionDate = endInscriptionDate;
    }

    public Status getStatus() {
        return status;
    }

    public Event status(Status status) {
        this.status = status;
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean isActive() {
        return active;
    }

    public Event active(Boolean active) {
        this.active = active;
        return this;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public Event createDate(Instant createDate) {
        this.createDate = createDate;
        return this;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public Instant getUpdatedDate() {
        return updatedDate;
    }

    public Event updatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public Event tournament(Tournament tournament) {
        this.tournament = tournament;
        return this;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public Event categories(Set<Category> categories) {
        this.categories = categories;
        return this;
    }

    public Event addCategory(Category category) {
        this.categories.add(category);
        category.getEvents().add(this);
        return this;
    }

    public Event removeCategory(Category category) {
        this.categories.remove(category);
        category.getEvents().remove(this);
        return this;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Event)) {
            return false;
        }
        return id != null && id.equals(((Event) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Event{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", playDate='" + getPlayDate() + "'" +
            ", endInscriptionDate='" + getEndInscriptionDate() + "'" +
            ", status='" + getStatus() + "'" +
            ", active='" + isActive() + "'" +
            ", createDate='" + getCreateDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }
}
