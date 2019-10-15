import { Moment } from 'moment';
import { ICategory } from 'app/shared/model/category.model';
import { Status } from 'app/shared/model/enumerations/status.model';

export interface IEvent {
  id?: number;
  name?: string;
  playDate?: Moment;
  endInscriptionDate?: Moment;
  status?: Status;
  active?: boolean;
  createDate?: Moment;
  updatedDate?: Moment;
  tournamentId?: number;
  categories?: ICategory[];
}

export class Event implements IEvent {
  constructor(
    public id?: number,
    public name?: string,
    public playDate?: Moment,
    public endInscriptionDate?: Moment,
    public status?: Status,
    public active?: boolean,
    public createDate?: Moment,
    public updatedDate?: Moment,
    public tournamentId?: number,
    public categories?: ICategory[]
  ) {
    this.active = this.active || false;
  }
}
