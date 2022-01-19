import { Component, OnInit } from '@angular/core'
import { ListeBibliothèquesService } from 'src/app/service/liste-bibliothèques.service'

@Component({
  selector: 'app-usagers',
  templateUrl: './usagers.component.html',
  styleUrls: ['./usagers.component.css'],
})
export class UsagersComponent implements OnInit {
  bibliothequehtml = {
    image: '',
    nom: '',
    description: '',
    adresse: '',
    telephone: '',
    horaire: '',
    contact: '',
    siteWeb: '',
  }

  constructor(private service: ListeBibliothèquesService) {}

  tableaubibliotheques: any
  showMe: boolean = false
  //resultatRechercheBiblio: any
  mc: any

  // filter(query: string) {
  //   console.log(query)
  // }

  ngOnInit(): void {
    this.getBibliothequeTs()
  }

  //méthode getBibliothequeTs pour ajouter
  getBibliothequeTs() {
    this.service.getBibliothequeService().subscribe((data) => {
      this.tableaubibliotheques = data
      //console.log(this.tableaubibliotheques)
    })
  }

  //méthode recherche
  rechercheBiblio(keyword: any) {
    //console.log(keyword.form.value.nom)
    let mc = keyword.form.value.nom
    this.service.rechercheMotCleService(mc).subscribe((data) => {
      this.tableaubibliotheques = data
      // console.log(data)
      // console.log(keyword.form.value.nom)

      //  metodi che non hanno funzionato
      // return this.tableaubibliotheques=keyword
      // this.bibliothequehtml = data
      //console.log(this.bibliothequehtml.nom)
    })
  }

  resultatRecherche(keyword: any) {
    let mc = keyword.form.value.nom
    console.log(keyword.form.value.nom)

    // let mc = keyword.form.value.nom
    this.showMe = true

    this.service.rechercheMotCleService(mc).subscribe((data) => {
      console.log(data)
      this.tableaubibliotheques = data
      this.rechercheBiblio = this.tableaubibliotheques._embedded.bibliotheques.length
      console.log(this.rechercheBiblio)
      console.log(keyword.form.value.nom)
      this.mc = keyword.form.value.nom
      console.log(mc)
      console.log(
        "D'après votre recherche à l'aide de " +
          this.mc +
          ' le resultat est de ' +
          this.rechercheBiblio,
      )
    })
    // if (this.message == this.mc) {
    //   console.log('Les resultats de votre recherche sont:')
    // } else if (this.message != this.mc) {
    //   console.log('Aucun resultat lié à votre recherche')
    // }

    // })
  }
}
