<template>
    <div id="loginform">
        <b-card-group>
            <b-card border-variant="light" style="max-width: 20rem;" class="mb-2 mx-auto">

                <h5 slot="header" class="mb-0">Log In</h5>

                <b-form-group label-for="input-username">
                    <b-form-input id="input-username" v-model="username" placeholder="Username"></b-form-input>
                </b-form-group>  

                <b-form-group label-for="input-pass">
                    <b-form-input id="input-pass" type="password" v-model="password" placeholder="Password"></b-form-input>
                </b-form-group>
                        
                <b-button variant="outline-primary" @click="signIn">Sign in</b-button><br><br>
                <b-link :to="{ path: 'register'}">Don't have account?</b-link><br><br>
                <b-alert variant="danger" v-model="error" dismissible>{{this.errorMessage}}</b-alert>
            </b-card>
        </b-card-group>
    </div>
</template>

<script>

</script>

<style scoped>

#loginform{
  opacity: 0.9;
  display: inline-block;
}


</style>

