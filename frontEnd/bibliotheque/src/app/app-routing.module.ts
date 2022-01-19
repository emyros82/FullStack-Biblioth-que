import { NgModule } from '@angular/core'
import { RouterModule, Routes } from '@angular/router'
import { AdminComponent } from './components/admin/admin.component'
import { PageAccueilComponent } from './components/page-accueil/page-accueil.component'
import { UsagersComponent } from './components/usagers/usagers.component'
import { LivresComponent } from './components/livres/livres.component'

const routes: Routes = [
  { path: '', component: PageAccueilComponent },
  { path: 'admin', component: AdminComponent },
  { path: 'usagers', component: UsagersComponent },
  { path: 'livres', component: LivresComponent },
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
