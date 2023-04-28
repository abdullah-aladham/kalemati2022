import { TestBed } from '@angular/core/testing';

import { HttpFetchApiService } from './http-fetch-api.service';

describe('HttpFetchApiService', () => {
  let service: HttpFetchApiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HttpFetchApiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
