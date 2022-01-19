import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser'

import { AppRoutingModule } from './app-routing.module'
import { AppComponent } from './app.component'
import { AdminComponent } from './components/admin/admin.component'
import { UsagersComponent } from './components/usagers/usagers.component'
import { PageAccueilComponent } from './components/page-accueil/page-accueil.component'
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { LivresComponent } from './components/livres/livres.component'

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    UsagersComponent,
    PageAccueilComponent,
    LivresComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
