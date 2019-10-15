export interface ICity {
  id?: number;
  name?: string;
  gobId?: number;
  latitude?: string;
  longitude?: string;
  locationId?: number;
}

export class City implements ICity {
  constructor(
    public id?: number,
    public name?: string,
    public gobId?: number,
    public latitude?: string,
    public longitude?: string,
    public locationId?: number
  ) {}
}
