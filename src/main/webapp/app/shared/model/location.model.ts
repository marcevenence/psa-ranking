import { ICity } from 'app/shared/model/city.model';

export interface ILocation {
  id?: number;
  name?: string;
  fullName?: string;
  gobId?: number;
  latitude?: string;
  longitude?: string;
  provinceId?: number;
  cities?: ICity[];
}

export class Location implements ILocation {
  constructor(
    public id?: number,
    public name?: string,
    public fullName?: string,
    public gobId?: number,
    public latitude?: string,
    public longitude?: string,
    public provinceId?: number,
    public cities?: ICity[]
  ) {}
}
