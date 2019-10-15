package com.psa.ranking.service.dto;
import io.swagger.annotations.ApiModel;
import java.time.Instant;
import java.io.Serializable;
import java.util.Objects;
import com.psa.ranking.domain.enumeration.Status;

/**
 * A DTO for the {@link com.psa.ranking.domain.Tournament} entity.
 */
@ApiModel(description = "Tournament entity.\n@author Marcelo Miño")
public class TournamentDTO implements Serializable {

    private Long id;

    private String name;

    private Instant playDate;

    private Instant endInscriptionDate;

    private Status status;

    private Boolean active;

    private Instant createDate;

    private Instant updatedDate;


    private Long addressId;

    private Long ownerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getPlayDate() {
        return playDate;
    }

    public void setPlayDate(Instant playDate) {
        this.playDate = playDate;
    }

    public Instant getEndInscriptionDate() {
        return endInscriptionDate;
    }

    public void setEndInscriptionDate(Instant endInscriptionDate) {
        this.endInscriptionDate = endInscriptionDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Instant getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Instant createDate) {
        this.createDate = createDate;
    }

    public Instant getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long personId) {
        this.ownerId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TournamentDTO tournamentDTO = (TournamentDTO) o;
        if (tournamentDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), tournamentDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "TournamentDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", playDate='" + getPlayDate() + "'" +
            ", endInscriptionDate='" + getEndInscriptionDate() + "'" +
            ", status='" + getStatus() + "'" +
            ", active='" + isActive() + "'" +
            ", createDate='" + getCreateDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", address=" + getAddressId() +
            ", owner=" + getOwnerId() +
            "}";
    }
}
