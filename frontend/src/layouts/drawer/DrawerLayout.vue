<template>
  <q-drawer
    v-model="leftDrawerOpen"
    show-if-above
    :width="300"
    :breakpoint="700"
  >
    <div class="avatarStyle">
      <q-avatar size="100px">
        <img src="https://cdn.quasar.dev/img/avatar.png" />
      </q-avatar>
      <div>
        <h5 style="margin-left: 1vw; color: black">John Smith</h5>
        <text-substitle1 style="margin-left: 1.6vw; color: black"
          >CEO, Oxish</text-substitle1
        >
      </div>
    </div>

    <q-list class="q-pl-xl" style="padding-top: 10vh">
      <q-btn rounded no-caps class="q-pr-sm" flat icon="dashboard" icon-left>
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 10px">
            Dashboard
          </h6>
        </template>
      </q-btn>

      <q-btn
        size="20px"
        rounded
        no-caps
        class="q-mt-xl q-pr-sm"
        flat
        icon="storefront"
        icon-left
      >
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 10px">
            Orders
          </h6>
        </template>
      </q-btn>

      <q-btn
        size="20px"
        rounded
        no-caps
        class="q-mt-xl q-mt-lgq-pr-sm"
        flat
        icon="groups"
        icon-left
      >
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 10px">
            Customers
          </h6>
        </template>
      </q-btn>

      <q-btn
        size="20px"
        rounded
        no-caps
        class="q-mt-xl q-pr-sm"
        flat
        icon="dashboard"
        icon-left
      >
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 10px">
            Reports
          </h6>
        </template>
      </q-btn>

      <q-btn
        size="20px"
        rounded
        no-caps
        class="q-mt-xl q-pr-sm"
        flat
        icon="summarize"
        icon-left
      >
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 10px">
            Dashboard
          </h6>
        </template>
      </q-btn>

      <q-separator class="q-my-xl" />

      <q-btn
        size="20px"
        rounded
        no-caps
        class="q-pr-sm"
        flat
        icon="settings"
        icon-left
      >
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 10px">
            Settings
          </h6>
        </template>
      </q-btn>

      <q-btn
        size="20px"
        rounded
        no-caps
        class="q-mt-xl q-pr-sm"
        flat
        icon="help"
        icon-left
      >
        <template v-slot:default>
          <h6 class="text-weight-regular text-center" style="margin-left: 15px">
            Help
          </h6>
        </template>
      </q-btn>
    </q-list>
  </q-drawer>
</template>

<script setup>
import { ref } from 'vue';

const leftDrawerOpen = ref(true);
</script>
<style scoped>
.avatarStyle {
  display: flex;
  flex-direction: row;
  align-items: center;
  padding-left: 1vw;
  padding-top: 3vh;
}
.listStyle {
  display: flex;
  align-items: center;
  flex-direction: column;
  justify-content: center;
  padding-top: 16px;
}
</style>
