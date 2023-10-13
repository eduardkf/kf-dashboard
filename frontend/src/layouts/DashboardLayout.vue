<template>
  <q-layout view="lHh LpR lFf">
    <q-header reveal>
      <q-toolbar class="row justify-between">
        <q-input
          standout
          v-model="text"
          input-class="text-left"
          :input-style="{ color: 'black' }"
          class="q-mt-md col-2"
          rounded
          placeholder="Search"
          bg-color="grey-3"
          label-color="red"
        >
          <template v-slot:append>
            <q-icon color="black" name="search" />
          </template>
        </q-input>
        <div class="row justify-between col-1">
          <q-item-section class="col-1" avatar>
            <q-icon style="color: #514d59" name="sym_o_notifications" />
          </q-item-section>
          <q-item-section class="col-1" avatar>
            <q-icon style="color: #514d59" name="sym_o_message" />
          </q-item-section>
          <q-avatar>
            <img src="https://cdn.quasar.dev/img/avatar.png" />
          </q-avatar>
        </div>
      </q-toolbar>
    </q-header>
    <q-drawer
      class="left-navigation text-white"
      show-if-above
      v-model="left"
      side="left"
    >
      <div class="full-height">
        <div style="height: calc(100% - 117px); padding: 10px">
          <q-toolbar class="q-pb-md">
            <q-avatar>
              <q-img style="width: 1vw" src="../assets/kf-logo-small.png" />
            </q-avatar>

            <q-toolbar-title style="color: #514d59">
              <div class="text-h6 text-weight-regular">Katty Fashion</div>
            </q-toolbar-title>
          </q-toolbar>
          <q-separator />
          <q-scroll-area style="height: 100%">
            <q-list padding>
              <menu-items-with-separators-vue
                v-for="(item, index) in menuItems.item"
                :key="index"
                :active-class="item.activeClass"
                :to="item.to"
                :class="item.clas"
                :section-start="item.sectionStart"
                :section-name="item.sectionName"
                :menu-item-name="item.section.menuItemName"
                :avatar="item.section.avatar"
              />
            </q-list>
          </q-scroll-area>
        </div>
      </div>
    </q-drawer>

    <q-page-container>
      <q-page class="row no-wrap">
        <div class="col">
          <div class="full-height">
            <q-scroll-area class="col q-pr-sm full-height" visible>
              <router-view />
            </q-scroll-area>
          </div>
        </div>
      </q-page>
    </q-page-container>
  </q-layout>
</template>

<script setup>
import { ref } from 'vue';
import MenuItemsWithSeparatorsVue from 'src/components/Menu/MenuItemsWithSeparators.vue';

const left = ref(false);

const menuItems = ref({
  item: [
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Dashboard',
        avatar: 'sym_o_dashboard',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Account Settings',
        avatar: 'sym_o_manage_accounts',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionName: 'Product',
      sectionStart: true,
      section: {
        menuItemName: 'Orders',
        avatar: 'sym_o_shopping_cart',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Another Button',
        avatar: 'sym_o_date_range',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Another Button',
        avatar: 'sym_o_savings',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: true,
      sectionName: 'Another Separator',
      section: {
        menuItemName: 'Another Button',
        avatar: 'sym_o_analytics',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Another Button',
        avatar: 'sym_o_code',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Another Button',
        avatar: 'sym_o_supervisor_account',
      },
    },
    {
      activeClass: 'active-class',
      to: '/dashboard',
      class: 'q-ma-sm navigation-item',
      sectionStart: false,
      sectionName: '',
      section: {
        menuItemName: 'Another Button',
        avatar: 'sym_o_stars',
      },
    },
  ],
});
</script>

<style scoped>
</style>
