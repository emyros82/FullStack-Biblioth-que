import { HttpClient } from '@angular/common/http'
import { identifierModuleUrl } from '@angular/compiler'
import { Injectable } from '@angular/core'

@Injectable({
  providedIn: 'root',
})
export class ListeBibliothèquesService {
  url = 'http://localhost:8080/bibliotheques'

  constructor(private http: HttpClient) {}

  // method get the elements
  getBibliothequeService() {
    return this.http.get(this.url)
  }

  //method save an element
  saveBibliothequeService(bibliotheque: any) {
    return this.http.post(this.url, bibliotheque)
  }

  //method delete an element in ds json and browser
  deleteBibliothequeService(idbibliotheques: any) {
    return this.http.delete(this.url + '/' + idbibliotheques)
  }

  //method patch : change only one element of database
  // patchBibliothequeService(bibliotheques: any) {
  //   return this.http.patch(this.url + '/' + bibliotheques.id, {
  //     available: !bibliotheques.available,
  //   })
  // }

  //method put : change elements of database
  recordingInformationsService(bibliotheques: any) {
    return this.http.put(this.url + '/' + bibliotheques.id, bibliotheques)
  }
  //methode rechercherService
  rechercheMotCleService(mc: any) {
    return this.http.get(this.url + '/search/ByName?toto=' + mc)
  }
  // rechercheService(bibliotheques: any) {
  //   return this.http.get(this.url + '/search/ByName?toto=' + bibliotheques.nom)
  // }
}
