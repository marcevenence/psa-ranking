import { IRoster } from 'app/shared/model/roster.model';
import { ProfileUser } from 'app/shared/model/enumerations/profile-user.model';

export interface IPlayer {
  id?: number;
  profile?: ProfileUser;
  personId?: number;
  rosters?: IRoster[];
}

export class Player implements IPlayer {
  constructor(public id?: number, public profile?: ProfileUser, public personId?: number, public rosters?: IRoster[]) {}
}
