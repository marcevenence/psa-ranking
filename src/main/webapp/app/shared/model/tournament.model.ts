import { Moment } from 'moment';
import { IEvent } from 'app/shared/model/event.model';
import { Status } from 'app/shared/model/enumerations/status.model';

export interface ITournament {
  id?: number;
  name?: string;
  playDate?: Moment;
  endInscriptionDate?: Moment;
  status?: Status;
  active?: boolean;
  createDate?: Moment;
  updatedDate?: Moment;
  addressId?: number;
  events?: IEvent[];
  ownerId?: number;
}

export class Tournament implements ITournament {
  constructor(
    public id?: number,
    public name?: string,
    public playDate?: Moment,
    public endInscriptionDate?: Moment,
    public status?: Status,
    public active?: boolean,
    public createDate?: Moment,
    public updatedDate?: Moment,
    public addressId?: number,
    public events?: IEvent[],
    public ownerId?: number
  ) {
    this.active = this.active || false;
  }
}
