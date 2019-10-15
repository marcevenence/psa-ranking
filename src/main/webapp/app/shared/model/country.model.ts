import { IProvince } from 'app/shared/model/province.model';

export interface ICountry {
  id?: number;
  description?: string;
  provinces?: IProvince[];
}

export class Country implements ICountry {
  constructor(public id?: number, public description?: string, public provinces?: IProvince[]) {}
}
