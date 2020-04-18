<template>
    
    <div id="registerForm">
        <b-card-group>
            <b-card header-tag="header" border-variant="light" style="max-width: 40rem;" class="mb-2 mx-auto">

                <h5 slot="header" class="mb-0">Register</h5>

                <b-form-group>
                    <b-form-input v-model="commonName" placeholder="Username"></b-form-input>
                </b-form-group>

                <b-form-group label-for="input-pass" description="Min 6 characters, 1 uppercase letter, 1 digit">
                    <b-form-input id="input-pass" type="password" v-model="password" :state="passwordValid" placeholder="Password"></b-form-input>
                </b-form-group>  

                <b-form-group label-for="input-repeatPass">
                    <b-form-input id="input-repeatPass" type="password" v-model="repeatedPassword" :state="repeatedPassValid" placeholder="Password repeat"></b-form-input>
                </b-form-group>

                
                <b-button variant="outline-primary" @click="register" class="mr-3">Register</b-button>
                <b-button variant="outline-primary" :to="{ path: 'login'}">Sign in</b-button><br><br>
                <b-alert variant="success" v-model="success">Activation link is sent on your email address!</b-alert>
                <b-alert variant="danger" v-model="error" dismissible>{{this.errorMessage}}</b-alert>
            </b-card>
        </b-card-group>
    </div>
    
    
</template>

<style scoped>

#registerForm{
  opacity: 0.9;
  display: inline-block;
  
}

</style>