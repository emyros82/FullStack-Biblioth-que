import { TestBed } from '@angular/core/testing';

import { ListeBibliothèquesService } from './liste-bibliothèques.service';

describe('ListeBibliothèquesService', () => {
  let service: ListeBibliothèquesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListeBibliothèquesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
