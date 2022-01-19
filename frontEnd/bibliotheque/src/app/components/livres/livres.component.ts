import { Component, OnInit } from '@angular/core'

import { LivresService } from 'src/app/service/livres.service'

@Component({
  selector: 'app-livres',
  templateUrl: './livres.component.html',
  styleUrls: ['./livres.component.css'],
})
export class LivresComponent implements OnInit {
  livreshtml = {
    image: '',
    nomLivre: '',
    nomAuteur: '',
    description: '',
    codeIsbn: '',
  }

  constructor(private serviceLivres: LivresService) {}
  tableaulivres: any
  isbn: any

  ngOnInit(): void {
    this.getLivresTs()
  }

  getLivresTs() {
    this.serviceLivres.getLivresService().subscribe((data) => {
      this.tableaulivres = data
      //console.log(this.tableaubibliotheques)
    })
  }

  getCodeIsbnTs(isbn: any) {
    let paramA = isbn.min
    let paramB = isbn.max
    this.serviceLivres.getCodeIsbnService(paramA, paramB).subscribe((data) => {
      this.isbn = data
      console.log(this.isbn)
      console.log(paramA, paramB)
    })
  }
}
