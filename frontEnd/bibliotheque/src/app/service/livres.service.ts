import { Injectable } from '@angular/core'
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root',
})
export class LivresService {
  url = 'http://localhost:8080/livres'
  url1 = 'http://localhost:8080/bibliotheques'

  constructor(private http: HttpClient) {}

  // method get the elements
  getLivresService() {
    return this.http.get(this.url)
  }

  livresBiblio1Service() {
    return this.http.get(this.url1 + '/1/livres')
  }

  livresBiblio2Service() {
    return this.http.get(this.url1 + '/2/livres')
  }

  livresBiblio3Service() {
    return this.http.get(this.url1 + '/3/livres')
  }

  livresBiblio4Service() {
    return this.http.get(this.url1 + '/4/livres')
  }

  livresBiblio5Service() {
    return this.http.get(this.url1 + '/5/livres')
  }
  getCodeIsbnService(paramA: any, paramB: any) {
    return this.http.get(
      'http://localhost:8080/livres/search/ByCodeISBN?minCode=' +
        paramA +
        '&maxCode=' +
        paramB,
    )
  }
}
