import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IProvince } from 'app/shared/model/province.model';

import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { filter, map } from 'rxjs/operators';
import { ICountry } from 'app/shared/model/country.model';
import { CountryService } from 'app/entities/country/country.service';
import { JhiAlertService } from 'ng-jhipster';

@Component({
  selector: 'jhi-province-detail',
  templateUrl: './province-detail.component.html'
})
export class ProvinceDetailComponent implements OnInit {
  province: IProvince;
  countries: ICountry[];

  constructor(
		  protected activatedRoute: ActivatedRoute,
		  protected jhiAlertService: JhiAlertService,
		  protected countryService: CountryService) 
		  {}

  ngOnInit() {
    this.activatedRoute.data.subscribe(({ province }) => {
      this.province = province;
    });
    this.countryService
    .query({
    	size: 2000
    })
    .pipe(
      filter((mayBeOk: HttpResponse<ICountry[]>) => mayBeOk.ok),
      map((response: HttpResponse<ICountry[]>) => response.body)
    )
    .subscribe((res: ICountry[]) => (this.countries = res), (res: HttpErrorResponse) => this.onError(res.message));
}

  previousState() {
    window.history.back();
  }
  
  protected onError(errorMessage: string) {
	    this.jhiAlertService.error(errorMessage, null, null);
  }
}
