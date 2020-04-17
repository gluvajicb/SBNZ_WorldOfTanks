<template>
    <b-card-group>
        <b-card border-variant="light" style="max-width: 24rem;" class="mb-2 mx-auto">
            <b-form-group
                label-for="input-username"
            >
                <b-form-input id="input-username" v-model="username" placeholder="Username"></b-form-input>
            </b-form-group>  

            <b-form-group
                label-for="input-pass"
            >
                <b-form-input id="input-pass" type="password" v-model="password" placeholder="Password"></b-form-input>
            </b-form-group>
        </b-card>
    </b-card-group>
</template>

<script>

</script>

<style scoped>


</style>

