/**
 * Created by Lv on 2016/11/16.
 */
import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
    /*{ path: '', redirectTo: '/report-list', pathMatch: 'full' },
    { path: 'check-list/:id', component: CheckListComponent }*/
];

@NgModule({
    imports: [ RouterModule.forRoot(routes) ],
    exports: [ RouterModule ]
})
export class AppRoutingModule {}
