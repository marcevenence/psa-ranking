export interface IDocType {
  id?: number;
  type?: string;
  description?: string;
}

export class DocType implements IDocType {
  constructor(public id?: number, public type?: string, public description?: string) {}
}
