import { Component, OnInit } from '@angular/core'
import { ListeBibliothèquesService } from 'src/app/service/liste-bibliothèques.service'

import { LivresService } from 'src/app/service/livres.service'

@Component({
  selector: 'app-page-accueil',
  templateUrl: './page-accueil.component.html',
  styleUrls: ['./page-accueil.component.css'],
})
export class PageAccueilComponent implements OnInit {
  livreshtml = {
    image: '',
    nom: '',
    description: '',
    adresse: '',
    telephone: '',
    horaire: '',
    contact: '',
    siteWeb: '',
  }
  constructor(
    private serviceLivres: LivresService,
    private serviceBibliotheques: ListeBibliothèquesService,
  ) {}
  tableaulivres: any
  tableaubiblioteques: any
  showMe: boolean = false
  buttonColor1: any
  buttonColor2: any
  buttonColor3: any
  buttonColor4: any
  buttonColor5: boolean = false
  // colorIf: String = '#32db64'
  // colorElse: String = '#32db64'
  currentCategorie: any

  ngOnInit(): void {
    this.getLivresTs
    this.getBibliothequeTs()
  }

  //méthode getBibliothequeTs pour ajouter les biblotheques
  getLivresTs() {
    this.serviceLivres.getLivresService().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  //méthode getBibliothequeTs pour ajouter
  getBibliothequeTs() {
    this.serviceBibliotheques.getBibliothequeService().subscribe((data) => {
      this.tableaubiblioteques = data
      //console.log(this.tableaubibliotheques)
    })
  }

  livresBiblio1() {
    this.buttonColor1 = '#345465'
    this.showMe = true
    this.serviceLivres.livresBiblio1Service().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  livresBiblio2() {
    this.buttonColor2 = '#008000'
    this.showMe = true
    this.serviceLivres.livresBiblio2Service().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  livresBiblio3() {
    this.buttonColor3 = '#800080'
    this.showMe = true
    this.serviceLivres.livresBiblio3Service().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  livresBiblio4() {
    this.buttonColor4 = '#FF7F50'
    this.showMe = true
    this.serviceLivres.livresBiblio4Service().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  getProductsByCat(c: any) {
    this.currentCategorie = c
    this.showMe = true
    this.serviceLivres.livresBiblio5Service().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  // livresBiblio5() {
  //   if ((this.buttonColor5 = true)) {
  //     this.colorIf
  //   } else {
  //     this.colorElse
  //   }
  // }
}
