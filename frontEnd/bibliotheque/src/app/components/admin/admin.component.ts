import { Component, OnInit } from '@angular/core'
import { ListeBibliothèquesService } from 'src/app/service/liste-bibliothèques.service'

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css'],
})
export class AdminComponent implements OnInit {
  bibliothequehtml = {
    id: '',
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

  tableaubibliotheques: any // variable locale

  showMe: boolean = false

  ngOnInit(): void {
    this.getBibliothequeTs()
  }

  //méthode getBibliothequeTs pour ajouter
  getBibliothequeTs() {
    this.service.getBibliothequeService().subscribe((data) => {
      this.tableaubibliotheques = data
      console.log(this.tableaubibliotheques)
    })
  }

  // qui sto dicendo che al click il metodo formulario modifica deve apparire con showMe
  formulaireModificationsTs(t: any) {
    this.showMe = true
    this.bibliothequehtml = t
  }

  //méthode deleteBibliothequeTs pour supprimer
  deleteBibliothequeTs(t: any) {
    this.service.deleteBibliothequeService(t.id).subscribe((data) => {
      console.log(
        "Vous avez bien supprimé la bibliothèque selectionnée du réseaux Bibliotèque d'Aix en Provence",
      )
    })
  }

  //méthode saveBibliothequeTs pour ajouter
  saveBibliothequeTs(bibliotheque: any) {
    console.log(bibliotheque.value)
    let data = bibliotheque.value
    this.service.saveBibliothequeService(bibliotheque).subscribe((data) => {
      console.log('Vous avez enregistré le nouvel établissement!')
      this.bibliothequehtml = bibliotheque
    })
  }

  recordingInformationsTs() {
    this.service
      .recordingInformationsService(this.bibliothequehtml)
      .subscribe((data) => {
        console.log(
          "L'établissement que vous avez inseré fait desormais partie du réseaux des bibliothèques d'Aix",
        )
      })
  }

  //méthode patchBibliothequeTs pour modifier un seul element
  // patchBibliothequeTs(tableaubibliotheques: any) {
  //   console.log(!tableaubibliotheques.available)
  //   this.service
  //     .patchBibliothequeService(tableaubibliotheques)
  //     .subscribe((data) => {
  //       console.log(
  //         'La modification que vous avez apporté a été enegistrée sur le site',
  //       )
  //       tableaubibliotheques.available = !tableaubibliotheques.available
  //     })
  // }

  // editEmployees(tableaubibliotheques: any) {
  //   this.bibliothequehtml = tableaubibliotheques
  // }
}
