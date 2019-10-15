import { ILocation } from 'app/shared/model/location.model';

export interface IProvince {
  id?: number;
  name?: string;
  fullName?: string;
  isoId?: string;
  gobId?: number;
  countryId?: number;
  locations?: ILocation[];
}

export class Province implements IProvince {
  constructor(
    public id?: number,
    public name?: string,
    public fullName?: string,
    public isoId?: string,
    public gobId?: number,
    public countryId?: number,
    public locations?: ILocation[]
  ) {}
}
