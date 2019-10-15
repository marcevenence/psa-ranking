import { Moment } from 'moment';

export interface ITeam {
  id?: number;
  active?: boolean;
  createDate?: Moment;
  updatedDate?: Moment;
  ownerId?: number;
}

export class Team implements ITeam {
  constructor(
    public id?: number,
    public active?: boolean,
    public createDate?: Moment,
    public updatedDate?: Moment,
    public ownerId?: number
  ) {
    this.active = this.active || false;
  }
}
